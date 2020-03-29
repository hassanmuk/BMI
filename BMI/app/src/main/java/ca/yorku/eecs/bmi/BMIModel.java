package ca.yorku.eecs.bmi;

public class BMIModel
{
    private double weight;
    private double height;

    public BMIModel(String w, String h)
    {
        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);
    }
    public String toPound()
    {
        double convP = this.weight / 0.454;
        String roundP = String.format("%.1f", convP);
        return roundP;

    }
    public String toFeetInch()
    {

        double x = this.height * 3.28084;
        double z = Math.floor(x);
        double y = (x - z) *12;
        int ft = (int) x;
        int inch = (int) y;
        String feet = String.format("%d", ft);
        String inches = String.format("%d", inch);
        String convF = (feet + "'" + inches + '"');
        return convF;
    }

    public String getBMI()
    {
        double index = this.weight / (this.height * this.height);
        String result = String.format("%.1f", index);
        return result;
    }



    public static void main(String[] args)
    {
        BMIModel myModel = new BMIModel("100","1.8");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("45", "1.35");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("80", "1.2");
        System.out.println(myModel.getBMI());
    }
}
