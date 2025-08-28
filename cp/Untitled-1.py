class Solution:
    def restoreIpAddresses(self, s: str) -> List[str]:
        result = []
        self.backtrack(s, 0, [], result)
        return result

    def backtrack(self, s, start, current, result):
        # Check if we have found a valid IP address
        if start == len(s) and len(current) == 4:
            result.append(".".join(current))
            return

        # Invalid conditions: more than 4 parts or all characters consumed
        if len(current) >= 4 or start >= len(s):
            return

        # Try different combinations of IP address parts
        for i in range(1, 4):
            # Check if remaining characters are enough to form a part
            if start + i > len(s):
                break

            part = s[start:start + i]
            if self.is_valid_part(part):
                current.append(part)
                self.backtrack(s, start + i, current, result)
                current.pop()

    def is_valid_part(self, part):
        # Check for leading zeros and range of the part
        if len(part) > 1 and part[0] == '0':
            return False

        num = int(part)
        return 0 <= num <= 255
