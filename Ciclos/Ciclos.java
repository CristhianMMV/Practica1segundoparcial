public class Ciclos
{
    
    public int serienumerica(int num){
    System.out.print("1 ");
    int A = 1;
    int B = 0;
    int C = 0;
    int D = 0;
    int Sol = 1;
    for(int i = 2;i <= num; ){
            if(Sol == A){
                Sol = A + 1;
                B = A + 1;
                i++;
                System.out.print(Sol + " ");
            }else if(Sol == B){
                Sol = B + 2;
                C = B + 2;
                i++;
                System.out.print(Sol + " ");
            }else if(Sol == C){
                Sol = C + 3;
                D = C + 3;
                i ++;
                System.out.print(Sol + " ");
            }else if(Sol == D){
                Sol = D + 2;
                System.out.print(Sol + " ");
                A = D + 2;

                i++;
            }
            
    }
    return Sol;
    }
    
    
     public int SucesionPadovan(int num){
        int numAnt = 1;
        int numAnt2 = 1;
        int numAnt3 = 1;
        int A = 0;
        int actual = 1;
        if(num == 1){
           System.out.print("1 ");
           return actual;
        }else if(num == 2){
           System.out.print("1 1 ");
           return actual;
        }else if(num == 3){
        System.out.print("1 1 1 ");
        return actual;
        }else{
            System.out.print("1 1 1 ");
             for(int i = 4;i < num;i++){
                
                }
        }
    
        return actual;
        }
    }