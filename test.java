import static java.lang.System.out;
import java.io.*;
public class test {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int i = 0;
        while(true){
            String str = br.readLine();
            String str1 = br.readLine();
            if (str.equals(str1)){
                out.println("正確答案");
                break;
            }
            i += 1;
            if (i==3){
                throw  new  RuntimeException("輸入三次錯誤！程式停止！");
                }
            }
        }
        
        
    }

