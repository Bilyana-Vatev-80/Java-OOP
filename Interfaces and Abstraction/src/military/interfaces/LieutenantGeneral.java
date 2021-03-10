package military.interfaces;

import military.PrivateImpl;

import java.util.List;

public interface LieutenantGeneral {
    void addPrivate(PrivateImpl priv);

    List<PrivateImpl> getPrivates();
}
