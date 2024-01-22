
package DAO;

import java.util.ArrayList;


public interface DAOInterface<T> {
    public boolean add(T t);
    public boolean update(T t);
    public boolean delete(T t);
    public ArrayList<T> getArrayList();
    public ArrayList<T> selectByName(String query);
}
