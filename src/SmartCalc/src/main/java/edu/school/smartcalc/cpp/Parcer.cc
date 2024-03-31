#include "SmartCalcModel.h"

void s21::SmartCalcModel::Parcer() {
  double num = 0;
  char* array = (char*)str;
  int m = 0;
  size_t i = 0;
  while (array != NULL) {
    i = 0;
    if (!strlen(array)) {
      break;
    }
    if (array[i] == '(') {
      if (array[i + 1] == '+' || array[i + 1] == '-') {
        str_.push({0, 0, zero});
        m++;
      }
      str_.push({0, 5, Lbracket_1});
      array++;
    }
    if ((array[i] >= 48 && array[i] <= 57)) {
      num = strtod(array, &array);
      str_.push({num, 0, number});
      m++;
    }
    if (array[i] == 'x') {
      str_.push({0, 0, X});
      array++;
      m++;
    }
    if (array[i] == '+') {
      if (array[0] == '+' && m == 0) {
        str_.push({0, 0, zero});
      }
      str_.push({0, 1, plus_1});
      array++;
      m++;
    }
    if (array[i] == '-') {
      if (array[0] == '-' && m == 0) {
        str_.push({0, 0, zero});
      }
      str_.push({0, 1, minus_1});
      array++;
      m++;
    }
    if (array[i] == '*') {
      str_.push({0, 2, mult_1});
      array++;
      m++;
    }
    if (array[i] == '/') {
      str_.push({0, 2, div_1});
      array++;
      m++;
    }
    if (array[i] == '^') {
      str_.push({0, 3, pow_1});
      array++;
      m++;
    }
    if (array[i] == 'm' && array[i + 1] == 'o' && array[i + 2] == 'd') {
      str_.push({0, 2, mod_1});
      array += 3;
      m++;
    }
    if (array[i] == 'l' && array[i + 1] == 'n') {
      str_.push({0, 4, ln_1});
      array += 2;
      m++;
    }
    if (array[i] == 's' && array[i + 1] == 'i' && array[i + 2] == 'n') {
      str_.push({0, 4, sin_1});
      array += 3;
      m++;
    }
    if (array[i] == 'c' && array[i + 1] == 'o' && array[i + 2] == 's') {
      str_.push({0, 4, cos_1});
      array += 3;
      m++;
    }
    if (array[i] == 't' && array[i + 1] == 'a' && array[i + 2] == 'n') {
      str_.push({0, 4, tan_1});
      array += 3;
      m++;
    }
    if (array[i] == 'l' && array[i + 1] == 'o' && array[i + 2] == 'g') {
      str_.push({0, 4, log_1});
      array += 3;
      m++;
    }
    if (array[i] == 'a' && array[i + 1] == 'c' && array[i + 2] == 'o' &&
        array[i + 3] == 's') {
      str_.push({0, 4, acos_1});
      array += 4;
      m++;
    }
    if (array[i] == 'a' && array[i + 1] == 's' && array[i + 2] == 'i' &&
        array[i + 3] == 'n') {
      str_.push({0, 4, asin_1});
      array += 4;
      m++;
    }
    if (array[i] == 'a' && array[i + 1] == 't' && array[i + 2] == 'a' &&
        array[i + 3] == 'n') {
      str_.push({0, 4, atan_1});
      array += 4;
      m++;
    }
    if (array[i] == 's' && array[i + 1] == 'q' && array[i + 2] == 'r' &&
        array[i + 3] == 't') {
      str_.push({0, 4, sqrt_1});
      array += 4;
      m++;
    }
    if (array[i] == ')') {
      str_.push({0, 5, Rbracket_1});
      array++;
      m++;
    }
  }
}