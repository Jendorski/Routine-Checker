package com.kudi.test.routinechecks.dagger.fragments

open class ARoutineFragment : BaseFragment(){

/*
    private fun subscribeUi(binding: RoutinesBinding) {
        viewModel.legoSet.observe(viewLifecycleOwner, Observer { result ->
            when (result.status) {
                com.kudi.test.routinechecks.data.Result.Status.SUCCESS -> {
                    binding.progressBar.hide()
                    result.data?.let { bindView(binding, it) }
                }
                com.kudi.test.routinechecks.data.Result.Status.LOADING -> binding.progressBar.show()
                com.kudi.test.routinechecks.data.Result.Status.ERROR -> {
                    binding.progressBar.hide()
                }
            }
        })
    }

    private fun bindView(binding: RoutinesBinding, routine: Routine) {
        routine.apply {
            setTitle(name)
            bindImageFromUrl(binding.image, imageUrl)
            binding.name.text = name
            binding.year.text = getString(R.string.year, year ?: 0)
            binding.numParts.text = getString(R.string.number_of_parts, numParts ?: 0)
            set = legoSet
        }
    }
*/

    override fun getTitle(): String? {
        return "A Routine"
    }

}