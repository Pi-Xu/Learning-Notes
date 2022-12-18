
## Item3: Know the Differences Between bytes and str

总结:

- bytes contains sequences of 8-bit values, and str contains sequences of Unicode code points.
- Use helper functions to ensure that the inputs you operate on are the type of character sequence that you expect (8-bit values, UTF-8-encoded strings, Unicode code points, etc).
- bytes and str instances can’t be used together with operators (like >, ==, +, and %).
- If you want to read or write binary data to/from a file, always open the file using a binary mode (like 'rb' or 'wb').
- If you want to read or write Unicode data to/from a file, be careful about your system’s default text encoding. Explicitly pass the encoding parameter to open if you want to avoid surprises.

主要是编码方式的问题, bytes and string的不同

## Item4: Prefer Interpolated F-Strings Over C-style Format Strings and str.format

本部分内容参考这篇[ipynb](item4.ipynb)