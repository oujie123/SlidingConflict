package com.example.common.customview;

public interface ICustomView<S extends BaseCustomViewModel> {
    void setData(S data);
}
