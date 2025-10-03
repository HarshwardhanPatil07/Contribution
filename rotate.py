from PIL import Image

# Open the image
img = Image.open("your_image.jpg")

# Rotate the image by 90 degrees counter-clockwise
rotated_img = img.rotate(90)

# Rotate the image by 45 degrees, expanding the canvas to prevent cropping
rotated_img_expanded = img.rotate(45, expand=True)

# Save or display the rotated image
rotated_img.save("rotated_image_90.jpg")
rotated_img_expanded.show()
