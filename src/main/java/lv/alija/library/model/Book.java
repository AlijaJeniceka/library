package lv.alija.library.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@ApiModel(description = "Model of book data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {

    @ApiModelProperty(notes = "The unique id of the book")
    @Min(value = 1)
    private Long id;

    @ApiModelProperty(notes = "Title of the book")
    @NotNull
    private String title;

    @ApiModelProperty(notes = "Author of the book")
    @NotNull
    private String author;

    @ApiModelProperty(notes = "Genre of the book")
    @NotNull
    private String genre;

    @ApiModelProperty(notes = "Book release year")
    @NotNull
    private Long releaseYear;

    @ApiModelProperty(notes = "Book ISBN number")
    @NotNull
    private String isbn;

    @ApiModelProperty(notes = "Book quantity")
    @NotNull
    private Long quantity;

}
