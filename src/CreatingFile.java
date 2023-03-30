import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreatingFile
{
    private String message;

    CreatingFile()
    {
        // default constructor
    }
    CreatingFile(String message)
    {
        this.message = message;
    }

    public void create_file(String content)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Secret.txt")))
        {
            writer.write(content);
            writer.close();

            System.out.println("Successfully saved!");
        }
        catch(Exception e)
        {
            System.out.println("Not saved successfully!");

            e.printStackTrace();
        }
    }
}
