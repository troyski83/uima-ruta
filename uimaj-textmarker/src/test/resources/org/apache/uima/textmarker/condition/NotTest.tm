PACKAGE org.apache.uima;

DECLARE T1, T2;

ANY+{-PARTOF(PERIOD), -PARTOF(COLON), -PARTOF(T1)-> MARK(T1)} PERIOD;
W{-PARTOF(T1) -> MARK(T2)};