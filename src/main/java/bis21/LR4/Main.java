package bis21.LR4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        WritingTool[] tools = new WritingTool[10];
        Random rand = new Random();

        for (int i = 0; i < tools.length; i++) {
            int type = rand.nextInt(3);
            if (type == 0) tools[i] = new Pen();
            else if (type == 1) tools[i] = new Pencil();
            else tools[i] = new Marker();
        }

        StringBuilder paper = new StringBuilder();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";



        for (int i = 0; i < 10; i++) {
            for (WritingTool tool : tools) {
                int len = rand.nextInt(3) + 3;
                StringBuilder word = new StringBuilder();
                for (int j = 0; j < len; j++) {
                    word.append(alphabet.charAt(rand.nextInt(alphabet.length())));
                }

                tool.write(paper, word.toString());
                if (tool.canErase()) {
                    tool.erase(paper);
                }
            }
        }

        System.out.println("Результат запису: " + paper.toString());

        Arrays.sort(tools, Comparator.comparingDouble(WritingTool::getWritingMaterial).reversed());

        System.out.println("\nВідсортовані засоби за залишком матеріалу:");
        for (WritingTool tool : tools) {
            System.out.println(tool);
        }
    }
}