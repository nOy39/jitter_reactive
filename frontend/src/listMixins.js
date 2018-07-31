export default {
  data() {
    return {
      searchName: '',
      names: ['Andrey', 'Natasha', 'Max', 'Vlad', 'Dmitriy'],
    }
  },
  computed: {
    filteredNames() {
      return this.names.filter(name => {
        return name.toLowerCase().indexOf(this.searchName.toLowerCase()) !== -1;
      })
    }
  },
}
