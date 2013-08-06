package mods.minecraft.darth.dc.client.gui.tooltips;

public class ToolTipLine
{
    public String text;
    public final int color;
    public int spacing;

    public ToolTipLine(String text, int color)
    {
        this.text = text;
        this.color = color;
    }

    public ToolTipLine(String text)
    {
        this(text, -1);
    }

    public ToolTipLine()
    {
        this("", -1);
    }

    public void setSpacing(int spacing)
    {
        this.spacing = spacing;
    }

    public int getSpacing()
    {
        return spacing;
    }
}
