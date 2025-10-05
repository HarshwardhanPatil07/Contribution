def compute_lps(pattern):
    """
    Compute the Longest Prefix Suffix (LPS) array for the pattern.
    LPS[i] = length of the longest proper prefix which is also a suffix
    """
    lps = [0] * len(pattern)
    length = 0  # length of previous longest prefix suffix
    i = 1

    while i < len(pattern):
        if pattern[i] == pattern[length]:
            length += 1
            lps[i] = length
            i += 1
        else:
            if length != 0:
                length = lps[length - 1]
            else:
                lps[i] = 0
                i += 1
    return lps


def KMP_search(text, pattern):
    """
    Search for occurrences of `pattern` in `text` using KMP algorithm.
    Returns a list of starting indices where pattern is found.
    """
    lps = compute_lps(pattern)
    i = j = 0  # i -> index for text, j -> index for pattern
    result = []

    while i < len(text):
        if text[i] == pattern[j]:
            i += 1
            j += 1

        if j == len(pattern):
            result.append(i - j)
            j = lps[j - 1]
        elif i < len(text) and text[i] != pattern[j]:
            if j != 0:
                j = lps[j - 1]
            else:
                i += 1

    return result


# ✅ Example usage:
if __name__ == "__main__":
    text = "ababcabcabababd"
    pattern = "ababd"
    matches = KMP_search(text, pattern)
    if matches:
        print(f"Pattern found at indices: {matches}")
    else:
        print("Pattern not found.")
