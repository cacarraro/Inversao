package inversao;

public class InverteString
{
    public InverteString() {
    }

    public char[] inversao(String s)
    {
        char[] caracteres = s.toCharArray();
        for (int i = 0; i < caracteres.length/2; i++)
        {
            char aux = caracteres[i];
            if (i == 0)
            {
                caracteres[i] = caracteres[caracteres.length-1];
                caracteres[caracteres.length-1] = aux;
            }
            else
                {
                    caracteres[i] = caracteres[(caracteres.length - 1) - i];
                    caracteres[(caracteres.length - 1) - i] = aux;
                }
        }
        return caracteres;
    }
}
class Main {
    public static void main(String[] args)
    {
        InverteString i = new InverteString();

        System.out.println(i.inversao("string para teste"));
    }
}