package leetcode_solutions.google;

import java.util.HashSet;
import java.util.Set;

/*
    929. Unique Email Addresses

    Every email consists of a local name and a domain name, separated by the @ sign.

    For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

    Besides lowercase letters, these emails may contain '.'s or '+'s.

    If you add periods ('.') between some characters in the local name part of an email address,
    mail sent there will be forwarded to the same address without dots in the local name.
    For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
    (Note that this rule does not apply for domain names.)

    If you add a plus ('+') in the local name, everything after the first plus sign will be ignored.
    This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.
    (Again, this rule does not apply for domain names.)

    It is possible to use both of these rules at the same time.

    Given a list of emails, we send one email to each address in the list.
    How many different addresses actually receive mails?

    Example 1:

    Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
    Output: 2
    Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails


    Note:

    1 <= emails[i].length <= 100
    1 <= emails.length <= 100
    Each emails[i] contains exactly one '@' character.

    Link : https://leetcode.com/problems/unique-email-addresses/description/

    Algorithm :

    Step 1 - Remove all elements after @
    Step 2 - Remove elements after +
    Step 3 - Replace '.' with ""
    Step 4 - Add it into Set<String> uniqueEmailsSet
    Step 5 - Return length(uniqueEmailsSet);

 */
public class E_Unique_Email_Addresses {

    public static int numUniqueEmails(String[] emails) {

        if(emails.length < 2){
            return emails.length;
        }

        Set<String> uniqueEmailsSet = new HashSet<String>();

        for(String email : emails){
            uniqueEmailsSet.add(email.toLowerCase().split("@")[0].split("/+")[0].replaceAll(".","")+"@"+email.split("@")[1]);
        }

        return uniqueEmailsSet.size();
    }

    public static void main(String args[]){
        System.out.println("E_Unique_Email_Addresses");
        String[] emailsArray = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emailsArray));
    }
}
