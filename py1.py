import cv2 
import numpy as np
# Load the image (grayscale or color)
image = cv2.imread(r"C:\Users\ADMIN\OneDrive\Pictures\p\horse.jpeg")
# Display the original image
cv2.imshow('Original Image', image)
# Calculate the negative of the image
negative_image = cv2.bitwise_not(image)
# Alternatively, for manual negative calculation:
# negative_image = 255 - image
# Display the negative image
cv2.imshow('Negative Image', negative_image)
# Save the negative image
cv2.imwrite('negative_image.jpg', negative_image)
# Wait for a key press and close the image windows
cv2.waitKey(0)
cv2.destroyAllWindows()