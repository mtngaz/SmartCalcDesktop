#include "SmartCalcModel.h"
#include "edu_school_smartcalc_model_ModelCalculator.h"

/*
 * Class:     edu_school_smartcalc_model_ModelCalculator
 * Method:    validator
 * Signature: (Ljava/lang/String;D)I
 */
JNIEXPORT jint JNICALL Java_edu_school_smartcalc_model_ModelCalculator_validator
  (JNIEnv * env, jobject obj, jstring str, jdouble num) {
    const char * temp = env -> GetStringUTFChars(str, nullptr);
    return s21::SmartCalcModel(temp, num).Validator();
}

/*
 * Class:     edu_school_smartcalc_model_ModelCalculator
 * Method:    calcExpr
 * Signature: (Ljava/lang/String;D)D
 */
JNIEXPORT jdouble JNICALL Java_edu_school_smartcalc_model_ModelCalculator_calcExpr
  (JNIEnv * env, jobject obj, jstring str, jdouble num) {
    const char * temp = env -> GetStringUTFChars(str, nullptr);
    return s21::SmartCalcModel(temp, num).SmartCalc();
}