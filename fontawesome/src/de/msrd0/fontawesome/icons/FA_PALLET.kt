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

object FA_PALLET: Icon {
	
	override val name get() = "Pallet"
	
	override val unicode get() = "f482"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M624 384c8.75 0 16-7.25 16-16v-32c0-8.75-7.25-16-16-16h-608C7.25 320 0 327.3 0 336v32C0 376.8 7.25 384 16 384H64v64H16C7.25 448 0 455.3 0 464v32C0 504.8 7.25 512 16 512h608c8.75 0 16-7.25 16-16v-32c0-8.75-7.25-16-16-16H576v-64H624zM288 448H128v-64h160V448zM512 448h-160v-64h160V448z"/></svg>"""
		else -> null
	}
	
}
