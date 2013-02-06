PACKAGE org.apache.uima;

DECLARE T1, T2, T3, T4, T5, T6, T7, T8;

DECLARE Annotation FS (Annotation doc, STRING lang);

Document{-> CREATE(FS, "doc" = Document, "lang" = "unknown")};
Document{ -> RETAINTYPE(MARKUP)};
W{STARTSWITH(FS) -> SHIFT(FS, 1, 2)} W+ MARKUP;