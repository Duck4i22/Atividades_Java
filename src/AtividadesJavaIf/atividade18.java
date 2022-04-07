package AtividadesJavaIf;
import java.util.Scanner;
public class atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    
        System.out.print("Digite um dia no formato: (dd/mm/aaaa): ");
        Integer data = scanner.nextInt();
        System.out.print("Digite um mes no formato: (dd/mm/aaaa): ");
        Integer data2 = scanner.nextInt();
        System.out.print("Digite uma ano no formato: (dd/mm/aaaa): ");
        Integer data3 = scanner.nextInt();
            if(data>=1&&data<=31){
                if(data2>=1&&data2<=12){
                    if(data2==2){
                        if(data>=1&&data<=29){
                            System.out.print(data+"/"+data2);}else{System.out.print("Digite um dia valido /"+data2);}
                            }else{
                        System.out.print(data+"/"+data2);
                        }
                }else{ System.out.print(data+"/Didgite um mes valido");}
            }else{System.out.print("Digite um dia valido /"+data2);}
        if(data3>0&&data3<=99999){
                System.out.print("/"+data3);
    }else{ System.out.print("/digite um ano valido");}
    
scanner.close();
        }
    } 