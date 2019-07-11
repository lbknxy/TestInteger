#include <jni.h>
#include <string>

extern "C" JNIEXPORT void JNICALL
Java_com_lbknxy_testinteger_MainActivity_updateId(JNIEnv* env, jobject obj, jobject objId) {

    jclass integerClass = env->GetObjectClass(objId);
    jfieldID  filedId = env->GetFieldID(integerClass,"value","I");
    env->SetIntField(objId,filedId,30);
    env->DeleteLocalRef(integerClass);
}
