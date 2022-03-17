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

object FA_FILE_CIRCLE_QUESTION: Icon {
	
	override val name get() = "File Circle-question"
	
	override val unicode get() = "e4ef"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M0 64C0 28.65 28.65 0 64 0H224V128C224 145.7 238.3 160 256 160H384V198.6C310.1 219.5 256 287.4 256 368C256 427.1 285.1 479.3 329.7 511.3C326.6 511.7 323.3 512 320 512H64C28.65 512 0 483.3 0 448V64zM256 128V0L384 128H256zM288 368C288 288.5 352.5 224 432 224C511.5 224 576 288.5 576 368C576 447.5 511.5 512 432 512C352.5 512 288 447.5 288 368zM432 464C445.3 464 456 453.3 456 440C456 426.7 445.3 416 432 416C418.7 416 408 426.7 408 440C408 453.3 418.7 464 432 464zM368 328C368 336.8 375.2 344 384 344C392.8 344 400 336.8 400 328V321.6C400 316.3 404.3 312 409.6 312H450.1C457.8 312 464 318.2 464 325.9C464 331.1 461.1 335.8 456.6 338.3L424.6 355.1C419.3 357.9 416 363.3 416 369.2V384C416 392.8 423.2 400 432 400C440.8 400 448 392.8 448 384V378.9L471.5 366.6C486.6 358.6 496 342.1 496 325.9C496 300.6 475.4 280 450.1 280H409.6C386.6 280 368 298.6 368 321.6V328z"/></svg>"""
		else -> null
	}
	
}
