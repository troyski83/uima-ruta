PACKAGE org.apache.uima;

DECLARE T1, T2, T3, T4, T5, T6, T7, T8;

TYPELIST typeList = {CW, CW, SW, SW, W};

Document{ -> REMOVE(typeList, CW)};
Document{SIZE(typeList,3,3) -> MARK(T1)};


