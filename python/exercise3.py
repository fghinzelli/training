def count_sheeps(sheep):
    return len([item for item in sheep if item])  

def test_count_sheeps():
    arrayTest = [False, True, True, True, None, None]
    if count_sheeps(arrayTest) == 3:
        print("OK")
    else:
        print("NOK")

test_count_sheeps()