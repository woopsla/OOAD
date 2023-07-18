#include <iostream>
#include <string>
using namespace std;

class Foo {
private:
    string x;
public:
    Foo(string val) {
         x = val;
    }

    // Invariant Over Specialization!!
    int length() {
        cout << "Foo" << endl;
        return x.size();
    }
};

class Bar : public Foo {
private:
    int cache = 0;
public:
    Bar(string val) : Foo(val) {
        cache = val.size();
    }
    int length() {
        std::cout << "Bar" << std::endl;
        return cache;
    }
};

int main() {
    Foo *foo = new Foo("this is a sample test string!");

    for (int i = 0; i < 5; i++)
        cout << foo->length() << endl;

    cout << "... Use Bar instead of Foo ... " << endl;

    foo = new Bar("this is a sample test string!");

    for (int i = 0; i < 5; i++)
        cout << foo->length() << endl;

    return 0;
}
