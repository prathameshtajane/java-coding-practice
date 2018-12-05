package leetcode_solutions;


/*

Input:

"{"id": "0001",	"type": "donut","name": "Cake","ppu": 0.55, "batters":{"batter":[{ "id": "1001", "type": "Regular" },{ "id": "1002", "type": "Chocolate" }]},"topping":[{ "id": "5001", "type": "None" },{ "id": "5002", "type": "Glazed" }]}"

we need to print it in following order:

Output :

"
{
"id": "0001",
"type": "donut",
"name": "Cake",
"ppu": 0.55,
"batters":
	{
	"batter":
		[

			{
			 "id": "1001",
			 "type": "Regular"
			},

			{
			 "id": "1002",
			 "type": "Chocolate"
			}
		]
	},
	"topping":
	[

		{
		 "id": "5001",
		 "type": "None"
		},

		{
		 "id": "5002",
		 "type": "Glazed"
		}
	]
}"


    Algorithm :

    Time Complexity - O(n)

    step 1 - make use of Stack to store parenthesis

 */

import java.util.Stack;

public class M_Format_JSON_String {

    static Stack<Character> paranthesis_stack = new Stack<>();


    //generate string with tabs
    private static String getTab(int size){
        StringBuffer tabs = new StringBuffer();
        for(int i = 0 ; i < size ; i++){
            tabs.append("\t");
        }
        return tabs.toString();
    }

    private static void formatJSONString(String input_string){
        char[] tokens = input_string.toCharArray();
        String tabs = "";

        for(char token : tokens){
            if(token == '{' || token == '['){
                tabs = getTab(paranthesis_stack.size());
                System.out.print("\n");
                System.out.print(tabs+token);
                System.out.print("\n"+tabs);
                paranthesis_stack.add(token);
            }else if(token == '}'|| token == ']'){
                paranthesis_stack.pop();
                tabs=getTab(paranthesis_stack.size());
                System.out.print("\n"+tabs+token);
            }else if(token == ','){
                System.out.print(','+"\n"+tabs);
            }else{
                System.out.print(token);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Format JSON input");
        String input_string = "{\"id\": \"0001\",\"type\": \"donut\",\"name\": \"Cake\",\"ppu\": \"0.55\"}";
        String input_string_2 = "\"{\"id\": \"0001\",\"type\": \"donut\",\"name\": \"Cake\",\"ppu\": 0.55,\"batters\":{\"batter\":[{ \"id\": \"1001\", \"type\": \"Regular\" },{ \"id\": \"1002\", \"type\": \"Chocolate\" }]},\"topping\":[{ \"id\": \"5001\", \"type\": \"None\" },{ \"id\": \"5002\", \"type\": \"Glazed\" }]}\"";
        String input_string_3 = "{[]}";
        formatJSONString(input_string_2);
    }
}
