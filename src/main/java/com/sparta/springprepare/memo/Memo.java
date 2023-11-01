package com.sparta.springprepare.memo;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

//@NoArgsConstructor //기본 생성자를 넣어줌
@AllArgsConstructor//기본 생성자를 넣어주지 않음, 멤버변수에 맞게 생성자 생성
@RequiredArgsConstructor //final 달린 멤버변수만 생성자 생성
public class Memo {
    private final String username;//final write once
    private String contents;


}