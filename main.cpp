#include <iostream>
#include <list>  
int main() {  
    // Создать список с элементами  
    std::list<int> values = {10, 20, 30, 40, 50};  
    // Вывести элементы списка  
    for (int val : values) { std::cout << val << " "; }  
    return 0;  
}

//пример кода организации стека на C++

struct stack {  
    int elements[1000];  
    int top = -1; //Индекс крайнего элемента  
    void push(int value) {  
        top++;  
        elements[top] = value;  
    }  
    int pop() {  
        if (top != -1) {  
            top--;  
            return elements[top + 1];  
        } else {  
            // Ошибка, попытка извлечь элемент из пустого стека  
        }  
    }  
    bool is_empty() {  
        return top == -1;  
    }  
};