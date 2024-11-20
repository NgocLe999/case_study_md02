package service.Interface;

import java.util.List;

public interface IReadWriteFile <T> {
        void writeFileBinary(List<T> T);
        List<T> readFileBinary(List<T> T);
}
