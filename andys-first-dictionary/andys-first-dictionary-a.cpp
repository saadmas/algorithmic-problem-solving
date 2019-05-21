#include <iostream>
#include <string>
#include <set>
#include <sstream>
using namespace std;

int main() {
    
    string word, buffer;
    set<string> dict;
    
    // Parse each word till EoF
    while (cin >> word) {
        
        // Parse each char in word
        for (int i = 0; i < word.length(); i++) {
            // Ensure lowercase 
            if (isalpha(word[i])) {
                word[i] = tolower(word[i]);
            // Remove non-alpha 
            } else {
                word[i] = ' ';  
            }
        }

        stringstream ss(word); 
        while (ss >> buffer) {
            dict.insert(buffer);
        }
    }
    
    for (set<string>::iterator it = dict.begin(); it != dict.end(); it++) {
        cout << *it << endl;
    }
        
    return 0;
}