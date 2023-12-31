package iuh.edu.vn.www_week04_spring.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;

@Data
public class Pagination<T> {
    private List<T> content = new ArrayList<T>();
    private int page;
    private int amount;
    private int totalPages;

    public Pagination(List<T> content, int page, int amount) {
        this.content = content.stream().skip(page * amount).limit(amount).collect(Collectors.toList());
        this.amount = amount;
        this.page = page;
        totalPages = content.size() / amount;
    }
}
