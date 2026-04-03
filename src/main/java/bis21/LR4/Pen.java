package bis21.LR4;

public class Pen extends WritingTool {
    public Pen() { super(); }
    public Pen(double material) { super(material); }

    @Override
    public StringBuilder write(StringBuilder sb, String text) {
        for (char c : text.toCharArray()) {
            if (writingMaterial >= 1.15) {
                sb.append(c);
                writingMaterial -= 1.15;
            }
        }
        return sb;
    }

    @Override
    public String toString() {
        return "Pen{" + "material=" + String.format("%.2f", writingMaterial) + "%}";
    }
}
