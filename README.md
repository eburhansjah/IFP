# IFP (Image Filtering Project)
## Overview
The goal of the project was to build a user-friendly android app that modifies uploaded images. Images can be in the form of .png files or .text files. 

The app displays the image/modified image on the screen.

### Group members:
- Daniellia Sumigar = dsumigar@bu.edu
- Dylan Ramdhan = dylram01@bu.edu
- Ellen Burhansjah = eburhan@bu.edu
- Ian Lee = ianxlee@bu.edu
- Jit Chakraborty = aurojit@bu.edu
- Minh Nguyen = minhtn@bu.edu
- XingLin He = hxl@bu.edu

# Usage

## Features of the app in action
### Design decisions
- Scrolling layout for a better user experience.
- Separated the upload image and upload text features into two different buttons.
- Displayed text based buttons for user-specified inputs.
- Implemented toast for error checking.
<img width="432" alt="layout_after_scrolling" src="https://github.com/eburhansjah/IFP/assets/130926828/1101cc4f-9db7-4e76-9851-b36f7e42fd40">

### I. Uploading stored image and image based on a text file
<img width="715" alt="zeroGB" src="https://github.com/eburhansjah/IFP/assets/130926828/9fb7942f-4cc3-499f-8865-5b11b938cca3">


Note: text file must be formatted particularly like the following in order to be converted into an image:

<img width="212" alt="format_of_text_file" src="https://github.com/eburhansjah/IFP/assets/130926828/a95ffbdd-c172-4a13-9bc5-f706887c0e77">

### II. Zero GB
Zero GB is a feature that recolors the uploaded image by zero-ing out all green and blue components of pixels. As a result, the modified image will have different shades of red, ranging from black (if the red component was originally zero) to full red (if the red component was at its maximum value).

<img width="616" alt="upload_img_txt" src="https://github.com/eburhansjah/IFP/assets/130926828/734a07e2-25fd-46a7-b2ed-c6a58b08eb10">

### III. Resizing
When resizing an image, user can specify the image's height, width. It is important to note that it will appear blurred. This is because shrunken image has been compressed and stretched to fit the dimensions of the imageView.

<img width="620" alt="resize" src="https://github.com/eburhansjah/IFP/assets/130926828/f79797f2-02cf-485d-aa1e-3e80636cd260">

### IV. Rotating 
<img width="704" alt="rotate" src="https://github.com/eburhansjah/IFP/assets/130926828/672c2386-a706-4d58-89b8-ad00be72013c">

### V. Blurring
<img width="758" alt="blur" src="https://github.com/eburhansjah/IFP/assets/130926828/8290f4a2-f3bb-4763-a41d-968cf229344d">

### VI. Grayscaling
<img width="698" alt="gray_scale" src="https://github.com/eburhansjah/IFP/assets/130926828/e1ee5b51-f369-41a0-9f51-e8071dadd952">

### VII. 























