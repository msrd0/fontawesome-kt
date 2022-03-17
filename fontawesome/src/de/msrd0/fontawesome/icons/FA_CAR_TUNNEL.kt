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

object FA_CAR_TUNNEL: Icon {
	
	override val name get() = "Car Tunnel"
	
	override val unicode get() = "e4de"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M190.8 277.5C191.8 274.2 194.9 272 198.4 272H313.6C317.1 272 320.2 274.2 321.2 277.5L334.1 320H177L190.8 277.5zM144 384C144 370.7 154.7 360 168 360C181.3 360 192 370.7 192 384C192 397.3 181.3 408 168 408C154.7 408 144 397.3 144 384zM368 384C368 397.3 357.3 408 344 408C330.7 408 320 397.3 320 384C320 370.7 330.7 360 344 360C357.3 360 368 370.7 368 384zM512 256V448C512 483.3 483.3 512 448 512H384H128H64C28.65 512 0 483.3 0 448V256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM384 512C401.7 512 416 497.7 416 480V376C416 355.2 404.7 337.1 387.8 327.4L366.9 262.7C359.4 239.6 337.9 224 313.6 224H198.4C174.1 224 152.6 239.6 145.1 262.7L124.1 327.4C107.3 337.1 96 355.2 96 376V480C96 497.7 110.3 512 128 512C145.7 512 160 497.7 160 480V448H352V480C352 497.7 366.3 512 384 512H384z"/></svg>"""
		else -> null
	}
	
}
