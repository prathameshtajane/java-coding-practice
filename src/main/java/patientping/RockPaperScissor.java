package patientping;


public class RockPaperScissor {

    public static int solution(String gmoves){
        char[] g_moves= gmoves.toCharArray();
        char[] f_moves={'R','P','S'};
        int max = 0;

        for(char f_move:f_moves){
            int temp_max = 0;
            for(char g_move : g_moves){
                switch (g_move){
                    case 'R' : {
                        switch (f_move){
                            case 'R' : temp_max+=1;
                            break;
                            case 'P' : temp_max+=2;
                            break;
                            case 'S' : temp_max+=0;
                            break;
                            default: temp_max+=0;
                        }
                    }
                    break;

                    case 'P' : {
                        switch (f_move){
                            case 'R' : temp_max+=0;
                                break;
                            case 'P' : temp_max+=1;
                                break;
                            case 'S' : temp_max+=2;
                                break;
                            default: temp_max+=0;
                        }
                    }
                    break;

                    case 'S' : {
                        switch (f_move){
                            case 'R' : temp_max+=2;
                                break;
                            case 'P' : temp_max+=0;
                                break;
                            case 'S' : temp_max+=1;
                                break;
                            default: temp_max+=0;
                        }
                    }
                    break;

                    default:temp_max+=0;
                }
            }
            max = max<temp_max ? temp_max : max;
        }
        return max;
    }

    public static void main(String args[]){
        System.out.println("RockPaperScissor");
        String inp1 = "RSPRS";
        String inp2 = "SRR";
        String inp3 = "PRPRRPP";
        String inp4 = "PPPPRRSSSSS";
        String inp5 = "P";
        System.out.println(RockPaperScissor.solution(inp1));
        System.out.println(RockPaperScissor.solution(inp2));
        System.out.println(RockPaperScissor.solution(inp3));
        System.out.println(RockPaperScissor.solution(inp4));
        System.out.println(RockPaperScissor.solution(inp5));

    }
}
