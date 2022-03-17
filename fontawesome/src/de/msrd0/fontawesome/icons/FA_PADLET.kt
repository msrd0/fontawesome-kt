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
import de.msrd0.fontawesome.Style.BRANDS

object FA_PADLET: Icon {
	
	override val name get() = "Padlet"
	
	override val unicode get() = "e4a0"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M297.9 0L298 .001C305.6 .1078 312.4 4.72 315.5 11.78L447.5 320.3L447.8 320.2L448 320.6L445.2 330.6L402.3 488.6C398.6 504.8 382.6 514.9 366.5 511.2L298.1 495.6L229.6 511.2C213.5 514.9 197.5 504.8 193.8 488.6L150.9 330.6L148.2 320.6L148.3 320.2L280.4 11.78C283.4 4.797 290.3 .1837 297.9 .0006L297.9 0zM160.1 322.1L291.1 361.2L298 483.7L305.9 362.2L436.5 322.9L436.7 322.8L305.7 347.9L297.1 27.72L291.9 347.9L160.1 322.1zM426 222.6L520.4 181.6H594.2L437.2 429.2L468.8 320.2L426 222.6zM597.5 181.4L638.9 257.6C642.9 265.1 635 273.5 627.3 269.8L579.7 247.1L597.5 181.4zM127.3 318.5L158.7 430L1.61 154.5C-4.292 144.1 7.128 132.5 17.55 138.3L169.4 222.5L127.3 318.5z"/></svg>"""
		else -> null
	}
	
}
