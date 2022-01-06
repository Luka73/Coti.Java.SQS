package interfaces;

public interface IBaseRepository<T> {
    void exportar(T obj) throws Exception;
}
