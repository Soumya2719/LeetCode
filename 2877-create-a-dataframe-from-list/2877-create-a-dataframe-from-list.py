import pandas as pd

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    column_name=("student_id","age")
    dt=pd.DataFrame(student_data,columns=column_name)
    return dt
    