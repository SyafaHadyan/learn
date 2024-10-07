public class NIlaiPresentasiAOK
{
    public static void main(String[] args)
    {
        int nilaiKKM = 90;
        for (int i = nilaiKKM; i >= 0; i--)
        {
            nilaiKKM = i;
        }
        System.out.print("Nilai presentasi anda adalah" + ' ' + nilaiKKM);
    }
}