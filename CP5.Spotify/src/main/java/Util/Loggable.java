package Util;

import Entidades._EntidadeBase;

public interface Loggable <T extends _EntidadeBase>{
    void logCreate(T entidade);
    void logRead(T entidade);
    void logReadAll(T entidade);
}
