package bis21.LR4;

public class Pencil extends WritingTool {
    private int totalWritten = 0;

    public Pencil() { super(); }
    public Pencil(double material) { super(material); }

    @Override
    public boolean canErase() {
        return true;
    }

    @Override
    public StringBuilder write(StringBuilder sb, String text) {
        for (char c : text.toCharArray()) {
            if (writingMaterial >= 0.95) {
                sb.append(c);
                writingMaterial -= 0.95;
                totalWritten++;

                if (totalWritten % 20 == 0) {
                    writingMaterial = Math.min(100.0, writingMaterial + 3.0);
                }
            }
        }
        return sb;
    }
}
