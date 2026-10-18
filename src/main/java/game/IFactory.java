package game;

public interface IFactory<T, K> {
    T create(K key);
}