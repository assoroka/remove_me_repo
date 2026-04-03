package bis21.LR4;

public abstract class WritingTool {
    protected double writingMaterial;

    public WritingTool() {
        this.writingMaterial = 100.0;
    }

    public WritingTool(double writingMaterial) {
        this.writingMaterial = writingMaterial;
    }

    public double getWritingMaterial() {
        return writingMaterial;
    }

    public abstract StringBuilder write(StringBuilder sb, String text);

    public void erase(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public boolean canErase() {
        return false;
    }

    @Override
    public String toString() {
        return "WritingTool{" + "material=" + String.format("%.2f", writingMaterial) + "%}";
    }
}
