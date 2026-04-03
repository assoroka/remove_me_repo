package bis21.LR4;

public class Marker extends WritingTool {
    private int symbolsCount = 0;

    public Marker() { super(); }
    public Marker(double material) { super(material); }

    @Override
    public StringBuilder write(StringBuilder sb, String text) {
        for (char c : text.toCharArray()) {
            double cost;
            symbolsCount++;

            if (symbolsCount <= 20) cost = 1.0;
            else if (symbolsCount <= 40) cost = 1.09;
            else cost = 1.21;

            if (writingMaterial >= cost) {
                sb.append(c);
                writingMaterial -= cost;
            }
        }
        return sb;
    }

    @Override
    public String toString() {
        return "Marker{" + "material=" + String.format("%.2f", writingMaterial) + "%}";
    }
}

