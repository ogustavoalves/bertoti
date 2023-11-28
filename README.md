# bertoti


```
# Certifique-se de importar pandas (pd) antes desta parte do código
res = pandas_ai.run(df, prompt='')

# Verifique se res é um DataFrame e se 'country' está presente
if isinstance(res, pd.DataFrame) and 'country' in res.columns:
    print(res['country'].to_string(index=False))
else:
    print("Erro: 'res' não é um DataFrame ou a coluna 'country' não está presente.") ```
