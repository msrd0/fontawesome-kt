/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

/** Sheet Plastic */
object FA_SHEET_PLASTIC: Icon {
	
	override val name get() = "Sheet Plastic"
	
	override val unicode get() = "e571"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M0 64C0 28.65 28.65 0 64 0H320C355.3 0 384 28.65 384 64V352H256C238.3 352 224 366.3 224 384V512H64C28.65 512 0 483.3 0 448V64zM171.3 52.69C165.1 46.44 154.9 46.44 148.7 52.69L52.69 148.7C46.44 154.9 46.44 165.1 52.69 171.3C58.93 177.6 69.06 177.6 75.31 171.3L171.3 75.31C177.6 69.07 177.6 58.94 171.3 52.69V52.69zM267.3 107.3C273.6 101.1 273.6 90.93 267.3 84.69C261.1 78.44 250.9 78.44 244.7 84.69L84.69 244.7C78.44 250.9 78.44 261.1 84.69 267.3C90.93 273.6 101.1 273.6 107.3 267.3L267.3 107.3zM384 384L256 512V384H384z"/></svg>"""
		else -> null
	}
	
}