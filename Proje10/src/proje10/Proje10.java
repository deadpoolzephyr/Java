package proje10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Proje10 {

    public static void main(String[] args) {
        
        // programa 2 parametre gönderilmiş mi kontrolü
        if(args.length<2)
        {
            System.out.println("2 adet dosya adi parametre olarak girilmelidir.");
            return;
        }

        // uzantı kontrol
        if(!args[0].endsWith(".txt") || !args[1].endsWith(".txt"))
        {
            System.out.println("Dosya uzantilari 'txt' formatinda olmalidir.");
            return;
        }

        File fFile = new File(args[0]);

        File sFile = new File(args[1]);

        if(!fFile.exists())
        {
            System.out.println("1. dosya bulunamadi.");
            return;
        }

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(fFile));

            int lineCount, wordCount, numberCount, sentenceCaseCount, spaceCount;
            lineCount = wordCount = numberCount = sentenceCaseCount = spaceCount = 0;
            String characters = "";
            ArrayList<Integer> frequencies = new ArrayList<>();

            String line;
            while((line = reader.readLine())!=null)
            {
                lineCount++;

                String[] splitted = line.split(" +");
                wordCount += splitted.length;

                for (String word:splitted)
                {
                    if(word.length()>1 && Character.isUpperCase(word.charAt(0)))
                        sentenceCaseCount++;
                }

                // satırdaki her karakter için
                for (char c:line.toCharArray())
                {
                    if(Character.isDigit(c))
                        numberCount++;
                    if(c==' ')
                        spaceCount++;

                    if(Character.isAlphabetic(c))
                    {
                        char lowered = Character.toLowerCase(c);
                        if(!characters.contains(Character.toString(lowered)))
                        {
                            // characters dizisine ekle
                            characters += lowered;
                            // frekansını 1 olarak frekanslar dizisine ekle
                            frequencies.add(characters.indexOf(lowered),1);
                        }
                        else
                        {
                            int index = characters.indexOf(lowered);
                            frequencies.set(index,frequencies.get(index)+1);
                        }
                    }
                }
            }

            // sonuçları yazdır
            BufferedWriter writer = new BufferedWriter(new FileWriter(sFile));
            writer.write("satir sayisi: "+lineCount+"\n");
            writer.write("kelime sayisi: "+wordCount+"\n");
            writer.write("rakam sayisi: "+numberCount+"\n");
            writer.write("buyuk harfle baslayan kelime sayisi: "+sentenceCaseCount+"\n");
            writer.write("bosluk sayisi: "+spaceCount+"\n");
            writer.write("frekanslar:\n");
            // frekansları yazdır
            for(int i=0; i<characters.length(); i++)
                writer.write("<"+characters.charAt(i)+"> = "+frequencies.get(i)+"\n");

            System.out.println("Sonuclar dosyaya yazdirildi.");

            
            reader.close();
            writer.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
        
    }
    
}
