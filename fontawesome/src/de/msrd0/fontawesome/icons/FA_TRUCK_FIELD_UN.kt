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

object FA_TRUCK_FIELD_UN: Icon {
	
	override val name get() = "Truck Field-un"
	
	override val unicode get() = "e58e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M320 32C343.7 32 364.4 44.87 375.4 64H427.2C452.5 64 475.4 78.9 485.7 102L538.5 220.8C538.1 221.9 539.4 222.9 539.8 224H544C579.3 224 608 252.7 608 288V320C625.7 320 640 334.3 640 352C640 369.7 625.7 384 608 384H576C576 437 533 480 480 480C426.1 480 384 437 384 384H256C256 437 213 480 160 480C106.1 480 64 437 64 384H32C14.33 384 0 369.7 0 352C0 334.3 14.33 320 32 320V288C14.33 288 0 273.7 0 256V160C0 142.3 14.33 128 32 128V96C32 60.65 60.65 32 96 32L320 32zM384 128V224H469.9L427.2 128H384zM160 336C133.5 336 112 357.5 112 384C112 410.5 133.5 432 160 432C186.5 432 208 410.5 208 384C208 357.5 186.5 336 160 336zM480 432C506.5 432 528 410.5 528 384C528 357.5 506.5 336 480 336C453.5 336 432 357.5 432 384C432 410.5 453.5 432 480 432zM253.3 135.1C249.4 129.3 242.1 126.6 235.4 128.7C228.6 130.7 224 136.9 224 144V240C224 248.8 231.2 256 240 256C248.8 256 256 248.8 256 240V196.8L290.7 248.9C294.6 254.7 301.9 257.4 308.6 255.3C315.4 253.3 320 247.1 320 240V144C320 135.2 312.8 128 304 128C295.2 128 288 135.2 288 144V187.2L253.3 135.1zM128 144C128 135.2 120.8 128 112 128C103.2 128 96 135.2 96 144V208C96 234.5 117.5 256 144 256C170.5 256 192 234.5 192 208V144C192 135.2 184.8 128 176 128C167.2 128 160 135.2 160 144V208C160 216.8 152.8 224 144 224C135.2 224 128 216.8 128 208V144z"/></svg>"""
		else -> null
	}
	
}
